package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ranking: ImageVector
    get() {
        if (_ranking != null) return _ranking!!
        _ranking = phosphorBoldIcon(
            name = "Ranking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108.62 103.79c-2.09-6.285 1.307-13.074 7.59-15.17l12-4c3.658-1.218 7.678-.604 10.806 1.651 3.128 2.254 4.982 5.874 4.984 9.729v40c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-24h0c-5.165-.002-9.749-3.309-11.38-8.21ZM252 208c0 6.627-5.373 12-12 12h-224C9.373 220 4 214.627 4 208c0-6.627 5.373-12 12-12h4v-92C20 92.954 28.954 84 40 84h36v-28C76 44.954 84.954 36 96 36h64c11.046 0 20 8.954 20 20v68h36c11.046 0 20 8.954 20 20v52h4c6.627 0 12 5.373 12 12ZM180 148v48h32v-48ZM100 196h56v-136h-56ZM44 196h32v-88h-32Z"),
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
        return _ranking!!
    }

private var _ranking: ImageVector? = null
