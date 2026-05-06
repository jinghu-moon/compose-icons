package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = phosphorThinIcon(
            name = "Ear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 104c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C204 62.026 169.974 28 128 28 86.026 28 52 62.026 52 104c0 28.4 9.55 37.61 18.79 46.52C79.25 158.67 88 167.11 88 188c0 22.091 17.909 40 40 40 11.37 0 20.83-4.76 28.92-14.55 1.426-1.633 3.894-1.833 5.564-.45 1.67 1.383 1.934 3.844 .596 5.55C153.52 230.13 141.71 236 128 236 101.502 235.972 80.028 214.498 80 188 80 170.51 73.16 163.91 65.24 156.28 55.28 146.68 44 135.79 44 104 44 57.608 81.608 20 128 20c46.392 0 84 37.608 84 84ZM175.86 164.54c-1.911-1.102-4.354-.449-5.46 1.46-2.712 4.712-8.253 7.011-13.505 5.605C151.644 170.198 147.994 165.437 148 160c0-10.67 5.44-17.92 11.2-25.6C165.49 126 172 117.33 172 104 172 79.699 152.301 60 128 60 103.699 60 84 79.699 84 104c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C92 84.118 108.118 68 128 68c19.882 0 36 16.118 36 36 0 10.67-5.44 17.92-11.2 25.6C146.51 138 140 146.67 140 160c0 9.052 6.08 16.975 14.824 19.318 8.743 2.343 17.97-1.479 22.496-9.318 1.102-1.911 .449-4.354-1.46-5.46Z"),
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
        return _ear!!
    }

private var _ear: ImageVector? = null
