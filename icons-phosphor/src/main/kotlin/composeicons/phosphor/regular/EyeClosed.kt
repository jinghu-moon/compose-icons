package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorRegularIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 175c-1.845 1.052-4.034 1.327-6.082 .765-2.048-.563-3.789-1.917-4.838-3.765l-19-33.2c-11.046 7.469-23.231 13.095-36.08 16.66l5.87 35.22c.35 2.094-.147 4.241-1.381 5.969-1.234 1.727-3.104 2.894-5.199 3.241-.427 .07-.858 .107-1.29 .11-3.908-.006-7.24-2.835-7.88-6.69l-5.77-34.58c-12.168 1.693-24.512 1.693-36.68 0l-5.77 34.58c-.641 3.863-3.984 6.694-7.9 6.69-.442-.002-.884-.039-1.32-.11-2.094-.348-3.965-1.514-5.199-3.241-1.234-1.727-1.731-3.875-1.381-5.969L94 155.46C81.156 151.884 68.978 146.247 57.94 138.77L39 172c-2.209 3.849-7.121 5.179-10.97 2.97C24.181 172.761 22.851 167.849 25.06 164L45.06 129C38.035 122.931 31.575 116.237 25.76 109c-1.976-2.206-2.571-5.323-1.548-8.102 1.023-2.779 3.498-4.765 6.433-5.163 2.935-.398 5.849 .858 7.575 3.265 16.6 20.54 45.64 45 89.78 45 44.14 0 73.18-24.49 89.78-45 1.707-2.457 4.642-3.756 7.608-3.367 2.966 .388 5.468 2.399 6.485 5.213 1.017 2.813 .379 5.959-1.653 8.154-5.815 7.237-12.275 13.931-19.3 20l20 35c1.084 1.843 1.386 4.043 .837 6.11-.549 2.067-1.902 3.828-3.757 4.89Z"),
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
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
