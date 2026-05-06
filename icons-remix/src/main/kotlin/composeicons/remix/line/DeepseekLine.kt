package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.DeepseekLine: ImageVector
    get() {
        if (_deepseekLine != null) return _deepseekLine!!
        _deepseekLine = remixIcon(
            name = "DeepseekLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.749 6.703c.6-.611 1.277-.818 2.073-.818 .678 0 1.056-.367 1.347-.65 .215-.209 .374-.373 .581-.308 .235 .073 .254 .345 .235 .565-.176 1.991-1.45 3.612-3.476 3.842-.187 .019-.224 .083-.22 .247 0 2.554-.986 4.787-2.547 6.737-.364 .455-.28 1.079 .269 1.276 .281 .101 .621 .226 1.053 .433 .254 .121 .303 .776-.401 .926-.448 .093-.934 .149-1.421 .147-1.2-.006-2.484 .163-3.567 .681-1.13 .541-2.172 .647-3.139 .703C6.052 20.749 1.92 17.389 1.146 12.983 .479 9.188 2.571 5.072 6.663 4.612c.484-.055 .958-.072 1.422-.054 .79 .03 1.536-.145 2.281-.319 .685-.16 1.367-.32 2.08-.32 .843 0 1.005 .319 .746 .412-.247 .089-1.192 1.169-.371 1.768 .753 .476 1.395 1.129 2.037 1.783 .841 .856 1.683 1.713 2.776 2.171 .183 .076 .262 .038 .314-.135 .035-.114 .072-.226 .109-.338 .051-.154 .101-.307 .146-.462 .042-.131 .008-.222-.124-.311C16.502 7.735 15.781 5.495 16.724 3.769c.202-.363 .491-.313 .621 .072 .155 .659 .334 .979 1.208 1.37 .644 .288 1.068 .738 1.195 1.491ZM12.289 8.158C10.753 7.02 8.799 6.384 6.887 6.599 5.505 6.755 4.487 7.513 3.844 8.546c.223 .016 .471 .043 .746 .084 2.269 .333 4.201 1.358 5.8 2.951 .969 .965 1.734 2.11 2.436 3.087 .58 .808 1.131 1.525 1.77 2.112 1.244-1.071 2.084-2.362 2.455-2.979 .847-1.409 .642-1.506-.197-1.902-.537-.253-1.334-.629-2.281-1.549C13.56 9.366 13.077 8.745 12.289 8.158ZM3.116 12.637c.591 3.363 3.592 5.836 7.301 5.85 .905 .003 1.732-.22 2.474-.575-.65-.66-1.193-1.386-1.69-2.079C10.441 14.775 9.798 13.814 8.978 12.997 7.663 11.687 6.116 10.875 4.3 10.608c-.574-.084-.957-.091-1.189-.079-.118 .694-.117 1.416 .005 2.108ZM15.194 11.143c-.475-.464-1.293-1.186-2.057-.767-1.137 .624 1.217 3.105 2.335 3.053 1.782-.083 .249-1.676-.278-2.286Z"),
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
        return _deepseekLine!!
    }

private var _deepseekLine: ImageVector? = null
