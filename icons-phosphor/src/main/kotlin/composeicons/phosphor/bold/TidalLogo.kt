package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TidalLogo: ImageVector
    get() {
        if (_tidalLogo != null) return _tidalLogo!!
        _tidalLogo = phosphorBoldIcon(
            name = "TidalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252.49 87.51l-38-38c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L168 79 136.49 47.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L88 79 58.49 49.51C56.238 47.251 53.18 45.981 49.99 45.981c-3.19 0-6.248 1.27-8.5 3.529L3.49 87.51C1.231 89.762-.039 92.82-.039 96.01c0 3.19 1.27 6.248 3.529 8.5l38 38c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529L88 113l23 23L79.51 167.51c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l40 40c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l40-40c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5L145 136l23-23 29.51 29.52c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l38-38c2.26-2.255 3.528-5.317 3.524-8.509-.004-3.192-1.279-6.251-3.544-8.501ZM50 117 29 96 50 75 71 96ZM128 199 105 176l23-23 23 23ZM128 119 105 96 128 73l23 23ZM206 117 185 96 206 75l21 21Z"),
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
        return _tidalLogo!!
    }

private var _tidalLogo: ImageVector? = null
