package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cigarette: ImageVector
    get() {
        if (_cigarette != null) return _cigarette!!
        _cigarette = phosphorThinIcon(
            name = "Cigarette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 132h-192c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12ZM28 176v-32c0-2.209 1.791-4 4-4h52v40h-52c-2.209 0-4-1.791-4-4ZM228 176c0 2.209-1.791 4-4 4h-132v-40h132c2.209 0 4 1.791 4 4ZM204.51 62c8.22-14.61 8.21-23.23 6.75-27.9-.732-2.732-2.506-5.069-4.94-6.51-1.996-.909-2.888-3.255-2-5.26 .436-.969 1.241-1.725 2.235-2.1 .994-.375 2.097-.339 3.065 .1 .66 .29 6.52 3.09 9.16 11 3 9 .53 20.66-7.29 34.57-8.22 14.61-8.21 23.24-6.75 27.91 .727 2.732 2.502 5.068 4.94 6.5 1.785 .743 2.783 2.657 2.37 4.546-.413 1.889-2.118 3.212-4.05 3.144-.562-.004-1.116-.123-1.63-.35-.66-.3-6.52-3.09-9.16-11C194.23 87.59 196.69 76 204.51 62ZM164.51 62c8.22-14.61 8.21-23.23 6.75-27.9-.732-2.732-2.506-5.069-4.94-6.51-1.996-.909-2.888-3.255-2-5.26 .436-.969 1.241-1.725 2.235-2.1 .994-.375 2.097-.339 3.065 .1 .66 .29 6.52 3.09 9.16 11 3 9 .53 20.66-7.29 34.57-8.22 14.61-8.21 23.24-6.75 27.91 .727 2.732 2.502 5.068 4.94 6.5 1.785 .743 2.783 2.657 2.37 4.546-.413 1.889-2.118 3.212-4.05 3.144-.562-.004-1.116-.123-1.63-.35-.66-.3-6.52-3.09-9.16-11C154.23 87.59 156.69 76 164.51 62Z"),
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
        return _cigarette!!
    }

private var _cigarette: ImageVector? = null
