package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Dimensions: ImageVector
    get() {
        if (_dimensions != null) return _dimensions!!
        _dimensions = radixIcon(
            name = "Dimensions",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.303 4.004c.1-.129 .294-.129 .394 0l1.239 1.593c.127 .164 .01 .403-.198 .403h-.738v6h.738c.208 0 .326 .239 .198 .403l-1.239 1.593c-.1 .129-.294 .129-.394 0L12.063 12.403c-.127-.164-.01-.403 .197-.403h.739v-6h-.739c-.208-0-.325-.239-.197-.403L13.303 4.004ZM9.653 4.008C10.41 4.085 11 4.724 11 5.5v7l-.008 .153c-.072 .706-.633 1.267-1.339 1.339l-.153 .008h-7l-.153-.008C1.641 13.921 1.079 13.359 1.008 12.653L1 12.5v-7c0-.777 .59-1.415 1.347-1.492l.153-.008h7l.153 .008ZM2.5 5c-.276 0-.5 .224-.5 .5v7c0 .276 .224 .5 .5 .5h7c.276-0 .5-.224 .5-.5v-7c0-.276-.224-.5-.5-.5h-7ZM9 .262c0-.208 .239-.326 .403-.198l1.593 1.239c.129 .1 .129 .294 0 .395L9.403 2.937c-.164 .127-.403 .01-.403-.197v-.739h-6v.739c-0 .208-.239 .325-.403 .197L1.004 1.697c-.129-.1-.129-.294 0-.395L2.597 .064c.164-.127 .403-.01 .403 .197v.739h6v-.738Z"),
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
        return _dimensions!!
    }

private var _dimensions: ImageVector? = null
