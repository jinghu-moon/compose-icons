package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PersonSimpleHike: ImageVector
    get() {
        if (_personSimpleHike != null) return _personSimpleHike!!
        _personSimpleHike = phosphorLightIcon(
            name = "PersonSimpleHike",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 78c16.569 0 30-13.431 30-30C182 31.431 168.569 18 152 18c-16.569 0-30 13.431-30 30 0 16.569 13.431 30 30 30ZM152 30c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM198 144v88c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-82.19c-26.23-1.73-34.76-14.89-42.35-26.59-3.43-5.3-6.68-10.31-11.5-14.52L117 143.61l38.52 27.51c1.564 1.133 2.487 2.949 2.48 4.88v56c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-52.91L112.08 154.86 77.5 234.39c-1.386 2.926-4.844 4.225-7.814 2.934-2.97-1.29-4.38-4.704-3.186-7.714L124 97.29c.662-1.522 1.925-2.701 3.488-3.258 1.563-.557 3.287-.442 4.762 .318 2.748 1.426 5.316 3.175 7.65 5.21 6.15 5.34 10 11.33 13.79 17.13C161.44 128.59 167.54 138 192 138c3.314 0 6 2.686 6 6ZM72 150c2.403 .001 4.575-1.431 5.52-3.64l24-56c.627-1.464 .646-3.117 .053-4.595-.593-1.478-1.749-2.66-3.213-3.285l-28-12c-3.046-1.299-6.568 .116-7.87 3.16l-24 56c-1.3 3.043 .109 6.564 3.15 7.87l28 12c.745 .321 1.548 .488 2.36 .49ZM51.88 128.85 71.15 83.85l17 7.27L68.88 136.12Z"),
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
        return _personSimpleHike!!
    }

private var _personSimpleHike: ImageVector? = null
