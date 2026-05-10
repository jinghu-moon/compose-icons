package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorFillIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.94 164c2.209 3.836 .891 8.736-2.945 10.945-3.836 2.209-8.736 .891-10.945-2.945l-19-33.2c-11.037 7.466-23.212 13.092-36.05 16.66l5.87 35.22c.35 2.094-.147 4.241-1.381 5.969-1.234 1.727-3.104 2.894-5.199 3.241-.427 .07-.858 .107-1.29 .11-3.908-.006-7.24-2.835-7.88-6.69l-5.77-34.58c-12.168 1.693-24.512 1.693-36.68 0l-5.77 34.58c-.641 3.863-3.984 6.694-7.9 6.69-.442-.002-.884-.039-1.32-.11-2.094-.348-3.965-1.514-5.199-3.241-1.234-1.727-1.731-3.875-1.381-5.969L94 155.46C81.156 151.884 68.978 146.247 57.94 138.77L39 172c-2.209 3.849-7.121 5.179-10.97 2.97C24.181 172.761 22.851 167.849 25.06 164L45.06 129C38.032 122.933 31.572 116.239 25.76 109c-2.372-2.934-2.372-7.126 0-10.06C44.56 75.72 77.55 48 128 48c50.45 0 83.44 27.72 102.22 51 2.372 2.934 2.372 7.126 0 10.06-5.812 7.239-12.272 13.933-19.3 20Z"),
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
