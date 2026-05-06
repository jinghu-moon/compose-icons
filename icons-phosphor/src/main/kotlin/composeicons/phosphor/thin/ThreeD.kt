package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorThinIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 148C100 134.745 89.255 124 76 124c-1.491 0-2.858-.829-3.547-2.151-.689-1.322-.586-2.917 .267-4.139L96.32 84h-40.32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c1.491-0 2.858 .829 3.547 2.151 .689 1.322 .586 2.917-.267 4.139L83.12 116.8c13.286 3.049 23.182 14.181 24.655 27.733 1.472 13.552-5.802 26.549-18.123 32.381-12.321 5.832-26.984 3.217-36.531-6.513-1.546-1.58-1.52-4.114 .06-5.66 1.58-1.546 4.114-1.52 5.66 .06 6.823 6.978 17.193 9.13 26.23 5.441C94.106 166.553 100.009 157.76 100 148ZM160 76c28.719 0 52 23.281 52 52 0 28.719-23.281 52-52 52h-24c-2.209 0-4-1.791-4-4v-96c0-2.209 1.791-4 4-4ZM160 84h-20v88h20c24.301 0 44-19.699 44-44C204 103.699 184.301 84 160 84ZM32 52h192c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-192c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4ZM224 204h-192c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h192c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _threeD!!
    }

private var _threeD: ImageVector? = null
