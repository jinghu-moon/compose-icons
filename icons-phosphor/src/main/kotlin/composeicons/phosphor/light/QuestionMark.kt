package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = phosphorLightIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M190 96c0 28-24.62 51.11-56 53.75v10.25c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-16c0-3.314 2.686-6 6-6 27.57 0 50-18.84 50-42C178 72.84 155.57 54 128 54 100.43 54 78 72.84 78 96c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6C66 66.22 93.81 42 128 42c34.19 0 62 24.22 62 54ZM128 194c-7.732 0-14 6.268-14 14 0 7.732 6.268 14 14 14 7.732 0 14-6.268 14-14 0-7.732-6.268-14-14-14Z"),
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
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
