package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LightningBolt: ImageVector
    get() {
        if (_lightningBolt != null) return _lightningBolt!!
        _lightningBolt = radixIcon(
            name = "LightningBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.156 .137c.143-.135 .355-.176 .54-.097 .212 .091 .335 .315 .297 .542L8.09 6h4.41c.189 0 .363 .107 .447 .276 .085 .169 .066 .372-.047 .523L6.9 14.8c-.138 .184-.385 .251-.597 .16-.212-.091-.335-.315-.297-.542L6.91 9h-4.41C2.311 9 2.137 8.893 2.053 8.724c-.085-.169-.067-.372 .047-.523L8.1 .2 8.156 .137ZM3.5 8h4c.147 0 .287 .065 .382 .177 .095 .112 .135 .26 .111 .405l-.663 3.977L11.5 7h-4c-.147 0-.287-.065-.382-.177C7.023 6.711 6.983 6.563 7.007 6.418L7.669 2.441 3.5 8Z"),
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
        return _lightningBolt!!
    }

private var _lightningBolt: ImageVector? = null
