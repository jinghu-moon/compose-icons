package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MouseRightClick: ImageVector
    get() {
        if (_mouseRightClick != null) return _mouseRightClick!!
        _mouseRightClick = phosphorLightIcon(
            name = "MouseRightClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 18h-32C77.774 18.039 50.039 45.774 50 80v96c.039 34.226 27.774 61.961 62 62h32c34.226-.039 61.961-27.774 62-62v-96C205.961 45.774 178.226 18.039 144 18ZM194 80v26h-35.51L193.22 71.27c.514 2.882 .775 5.803 .78 8.73ZM189.1 58.42 141.51 106h-7.51v-23.51L175.38 41.11c5.799 4.682 10.486 10.595 13.72 17.31ZM164.91 34.6 134 65.51v-35.51h10c7.221-.003 14.357 1.567 20.91 4.6ZM112 30h10v76h-60v-26C62.033 52.399 84.399 30.033 112 30ZM144 226h-32C84.399 225.967 62.033 203.601 62 176v-58h132v58c-.033 27.601-22.399 49.967-50 50Z"),
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
        return _mouseRightClick!!
    }

private var _mouseRightClick: ImageVector? = null
