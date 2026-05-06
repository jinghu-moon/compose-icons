package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorBoldIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 36c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12 5.373 12 12v52h-168v-52C44 65.373 49.373 60 56 60c6.627 0 12-5.373 12-12C68 41.373 62.627 36 56 36 36.118 36 20 52.118 20 72v92c0 26.51 21.49 48 48 48 26.51 0 48-21.49 48-48v-16h24v16c0 26.51 21.49 48 48 48 26.51 0 48-21.49 48-48v-92C236 52.118 219.882 36 200 36ZM68 188C54.745 188 44 177.255 44 164v-9l31.74 31.74c-2.493 .843-5.108 1.269-7.74 1.26ZM92 164c-.004 1.54-.151 3.077-.44 4.59L71 148h21ZM188 188c-13.255 0-24-10.745-24-24v-9l31.74 31.74c-2.493 .843-5.108 1.269-7.74 1.26ZM212 164c-.004 1.54-.151 3.077-.44 4.59L191 148h21Z"),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
