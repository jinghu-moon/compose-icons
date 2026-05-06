package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorBoldIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.5 95.53h0l-64-64C158.248 29.27 155.19 28 152 28h-112C33.373 28 28 33.373 28 40v112c-.004 2.921 1.064 5.743 3 7.93 .15 .18 .31 .36 .5 .56l64 64h0c2.255 2.252 5.313 3.515 8.5 3.51h112c6.627 0 12-5.373 12-12v-112c-0-3.175-1.259-6.221-3.5-8.47ZM164 69l23 23h-23ZM92 187 69 164h23ZM92 140h-40v-71l40 40ZM69 52h71v40h-31ZM140 116v24h-24v-24ZM116 204v-40h31l40 40ZM204 187 164 147v-31h40Z"),
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
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
