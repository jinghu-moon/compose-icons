package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) return _bezierCurve!!
        _bezierCurve = phosphorThinIcon(
            name = "BezierCurve",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M217.83 148.07C211.432 119.682 192.062 95.953 165.53 84h74.47c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-84.29C153.713 62.233 141.911 52.019 128 52.019c-13.911 0-25.713 10.213-27.71 23.981h-84.29c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h74.47C63.938 95.953 44.568 119.682 38.17 148.07c-14.645 .967-26.058 13.078-26.155 27.754-.097 14.676 11.155 26.937 25.786 28.097 14.631 1.16 27.675-9.174 29.892-23.682C69.911 165.732 60.549 151.973 46.24 148.71 52.991 120.48 73.757 97.69 101.24 88.35c3.648 11.697 14.478 19.663 26.73 19.663 12.252 0 23.082-7.966 26.73-19.663 27.48 9.343 48.246 32.132 55 60.36-14.309 3.263-23.671 17.022-21.453 31.53 2.218 14.508 15.261 24.842 29.892 23.682 14.631-1.16 25.883-13.421 25.786-28.097-.097-14.676-11.51-26.787-26.155-27.754ZM60 176c0 11.046-8.954 20-20 20C28.954 196 20 187.046 20 176c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM128 100c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM216 196c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
