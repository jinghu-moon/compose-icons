package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorBoldIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.6 62.65l-88-48.18c-5.977-3.29-13.223-3.29-19.2 0L30.4 62.64C23.986 66.149 19.998 72.879 20 80.19v95.62c-.002 7.311 3.986 14.041 10.4 17.55l88 48.17c5.976 3.294 13.224 3.294 19.2 0l88-48.18c6.411-3.508 10.398-10.232 10.4-17.54v-95.62c-.002-7.308-3.989-14.032-10.4-17.54ZM164 152v47.72l-24 13.14v-77.75L212 95.69v22.92l-41.76 22.86c-3.848 2.106-6.241 6.143-6.24 10.53ZM85.76 141.47 44 118.61v-22.92l72 39.42v77.75L92 199.72v-47.72c.001-4.387-2.392-8.424-6.24-10.53ZM83.14 61.13l39.1 21.4c3.587 1.973 7.933 1.973 11.52 0L172.86 61.13 199 75.45l-71 38.87L57 75.45ZM128 36.57l19.87 10.88L128 58.33 108.13 47.45ZM44 146l24 13.14v27.47L44 173.44ZM188 186.61v-27.5L212 146v27.47Z"),
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
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
