package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.EscalatorDown: ImageVector
    get() {
        if (_escalatorDown != null) return _escalatorDown!!
        _escalatorDown = phosphorLightIcon(
            name = "EscalatorDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M171.76 84.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L194 89.51v-41.51c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v41.51L219.76 75.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333l-24 24c-2.343 2.34-6.137 2.34-8.48 0ZM238 160v40c0 7.732-6.268 14-14 14h-56c-1.675 0-3.274-.699-4.41-1.93L69.37 110h-37.37C24.268 110 18 103.732 18 96v-40C18 48.268 24.268 42 32 42h56c1.675-0 3.274 .699 4.41 1.93L186.63 146h37.37c7.732 0 14 6.268 14 14ZM226 160c0-1.105-.895-2-2-2h-40c-1.675 0-3.274-.699-4.41-1.93L85.37 54h-53.37c-1.105 0-2 .895-2 2v40c0 1.105 .895 2 2 2h40c1.675-0 3.274 .699 4.41 1.93L170.63 202h53.37c1.105 0 2-.895 2-2Z"),
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
        return _escalatorDown!!
    }

private var _escalatorDown: ImageVector? = null
