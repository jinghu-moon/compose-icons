package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FacebookCircleFill: ImageVector
    get() {
        if (_facebookCircleFill != null) return _facebookCircleFill!!
        _facebookCircleFill = remixIcon(
            name = "FacebookCircleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 2C6.478 2 2.001 6.477 2.001 12c0 4.991 3.657 9.128 8.438 9.878v-6.988h-2.539v-2.891h2.539v-2.203c0-2.506 1.493-3.891 3.777-3.891 1.094 0 2.238 .195 2.238 .195v2.461h-1.261c-1.242 0-1.63 .771-1.63 1.562v1.876h2.773l-.443 2.891h-2.33v6.988c4.781-.75 8.437-4.887 8.437-9.878C22.001 6.477 17.524 2 12.001 2Z"),
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
        return _facebookCircleFill!!
    }

private var _facebookCircleFill: ImageVector? = null
