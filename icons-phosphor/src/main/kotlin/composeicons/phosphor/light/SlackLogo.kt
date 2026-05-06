package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SlackLogo: ImageVector
    get() {
        if (_slackLogo != null) return _slackLogo!!
        _slackLogo = phosphorLightIcon(
            name = "SlackLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218 128c13.255-9.941 15.941-28.745 6-42C214.059 72.745 195.255 70.059 182 80v-24C182 43.087 173.737 31.623 161.487 27.54 149.237 23.456 135.748 27.67 128 38 118.059 24.745 99.255 22.059 86 32 72.745 41.941 70.059 60.745 80 74h-24C43.087 74 31.623 82.263 27.54 94.513 23.456 106.763 27.67 120.252 38 128c-13.255 9.941-15.941 28.745-6 42 9.941 13.255 28.745 15.941 42 6v24c0 12.913 8.263 24.377 20.513 28.46 12.25 4.083 25.739-.13 33.487-10.46 9.941 13.255 28.745 15.941 42 6 13.255-9.941 15.941-28.745 6-42h24c12.913 0 24.377-8.263 28.46-20.513C232.544 149.237 228.33 135.748 218 128ZM200 86c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18h-18v-18c0-9.941 8.059-18 18-18ZM152 38c9.941 0 18 8.059 18 18v48c0 9.941-8.059 18-18 18h-18v-66c0-9.941 8.059-18 18-18ZM86 56c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18v18h-18C94.059 74 86 65.941 86 56ZM38 104C38 94.059 46.059 86 56 86h48c9.941 0 18 8.059 18 18v18h-66c-9.941 0-18-8.059-18-18ZM56 170c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18h18v18c0 9.941-8.059 18-18 18ZM104 218c-9.941 0-18-8.059-18-18v-48c0-9.941 8.059-18 18-18h18v66c0 9.941-8.059 18-18 18ZM170 200c0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18v-18h18c9.941 0 18 8.059 18 18ZM200 170h-48c-9.941 0-18-8.059-18-18v-18h66c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
        return _slackLogo!!
    }

private var _slackLogo: ImageVector? = null
