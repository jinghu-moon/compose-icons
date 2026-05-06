package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) return _circleDashed!!
        _circleDashed = phosphorBoldIcon(
            name = "CircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92.38 38.05c-.799-3.083-.339-6.358 1.277-9.102 1.617-2.744 4.258-4.733 7.343-5.528 17.71-4.573 36.29-4.573 54 0 4.247 .983 7.627 4.193 8.828 8.383 1.202 4.191 .036 8.703-3.045 11.788-3.081 3.084-7.592 4.256-11.784 3.059-13.775-3.552-28.225-3.552-42 0C100.588 48.309 94.045 44.46 92.38 38.05ZM50.94 52.34C38.129 65.392 28.84 81.48 23.94 99.1c-.85 3.069-.445 6.349 1.124 9.119 1.57 2.77 4.176 4.803 7.246 5.651 1.043 .284 2.119 .429 3.2 .43 5.393-.002 10.122-3.602 11.56-8.8 3.811-13.699 11.036-26.206 21-36.35 4.642-4.73 4.57-12.328-.16-16.97C63.18 47.538 55.582 47.61 50.94 52.34ZM47.06 150.48c-1.878-6.254-8.412-9.859-14.704-8.112-6.292 1.747-10.032 8.205-8.416 14.532 4.893 17.628 14.183 33.725 27 46.78 4.716 4.287 11.961 4.139 16.499-.337 4.537-4.476 4.784-11.718 .561-16.493C58.055 176.694 50.85 164.18 47.06 150.48ZM149 209.35c-13.774 3.556-28.226 3.556-42 0-4.192-1.196-8.703-.025-11.784 3.059-3.081 3.085-4.246 7.597-3.045 11.788 1.202 4.191 4.581 7.4 8.828 8.383 17.71 4.573 36.29 4.573 54 0 4.247-.983 7.627-4.193 8.828-8.383 1.202-4.191 .036-8.703-3.045-11.788-3.081-3.084-7.592-4.256-11.784-3.059ZM223.72 142.13c-6.374-1.738-12.954 2.004-14.72 8.37-3.811 13.699-11.036 26.206-21 36.35-4.645 4.728-4.578 12.325 .15 16.97 4.728 4.645 12.325 4.578 16.97-.15 12.809-13.057 22.098-29.148 27-46.77 .848-3.074 .439-6.359-1.139-9.131-1.578-2.771-4.194-4.8-7.271-5.639ZM208.95 105.52c1.878 6.254 8.412 9.859 14.704 8.112 6.292-1.747 10.032-8.205 8.416-14.532-4.893-17.628-14.183-33.725-27-46.78-2.951-3.3-7.479-4.707-11.78-3.662-4.301 1.046-7.678 4.375-8.784 8.661-1.107 4.286 .237 8.834 3.494 11.831 9.945 10.156 17.15 22.67 20.94 36.37Z"),
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
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
