package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NetworkX: ImageVector
    get() {
        if (_networkX != null) return _networkX!!
        _networkX = phosphorDuotoneIcon(
            name = "NetworkX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 40v32c0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8v-32c0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8ZM80 168h-32c-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M232 112h-96v-24h8c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16h-32c-8.837 0-16 7.163-16 16v32c0 8.837 7.163 16 16 16h8v24h-96c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v32h-8c-8.837 0-16 7.163-16 16v32c0 8.837 7.163 16 16 16h32c8.837 0 16-7.163 16-16v-32c0-8.837-7.163-16-16-16h-8v-32h112v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM112 40h32v32h-32ZM80 208h-32v-32h32ZM221.65 173.66 203.31 192l18.35 18.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L192 203.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L180.69 192 162.34 173.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L192 180.69l18.34-18.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32Z"),
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
        return _networkX!!
    }

private var _networkX: ImageVector? = null
