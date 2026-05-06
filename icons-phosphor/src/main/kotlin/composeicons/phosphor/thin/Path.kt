package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Path: ImageVector
    get() {
        if (_path != null) return _path!!
        _path = phosphorThinIcon(
            name = "Path",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 172c-13.918 .001-25.722 10.225-27.71 24h-100.29C52.118 196 36 179.882 36 160c0-19.882 16.118-36 36-36h96c19.882 0 36-16.118 36-36C204 68.118 187.882 52 168 52h-96c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h96c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28h-96c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44h100.29c2.135 14.791 15.509 25.299 30.385 23.872 14.876-1.426 26.01-14.284 25.295-29.211C227.256 183.733 214.944 171.999 200 172ZM200 220c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _path!!
    }

private var _path: ImageVector? = null
