package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NetworkX: ImageVector
    get() {
        if (_networkX != null) return _networkX!!
        _networkX = phosphorFillIcon(
            name = "NetworkX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 120c0 4.418-3.582 8-8 8h-32v16c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-16h-112v32h8c8.837 0 16 7.163 16 16v32c0 8.837-7.163 16-16 16h-32c-8.837 0-16-7.163-16-16v-32c0-8.837 7.163-16 16-16h8v-32h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h96v-24h-8C103.163 88 96 80.837 96 72v-32c0-8.837 7.163-16 16-16h32c8.837 0 16 7.163 16 16v32c0 8.837-7.163 16-16 16h-8v24h96c4.418 0 8 3.582 8 8ZM221.66 162.34c-1.501-1.502-3.537-2.346-5.66-2.346-2.123 0-4.159 .844-5.66 2.346L192 180.69 173.66 162.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L180.69 192l-18.35 18.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L192 203.31l18.34 18.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L203.31 192l18.35-18.34c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66Z"),
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
