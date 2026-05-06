package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandStripe: ImageVector
    get() {
        if (_brandStripe != null) return _brandStripe!!
        _brandStripe = tablerFilledIcon(
            name = "BrandStripe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.5 2c2.45 0 4.543 .44 5.928 1.096 .39 .185 .618 .599 .564 1.028l-.5 4c-.04 .32-.232 .601-.515 .755-.283 .154-.624 .162-.914 .021C16.016 8.391 14.445 8.077 12.895 8.077q-.206 .001-.332 .026l.028 .024 .07 .047c.314 .207 .832 .437 1.672 .746C18.157 10.271 20 12.16 20 15.5c0 2.13-.758 3.732-2.295 4.924C16.412 21.447 14.283 22 12 22 9.6 22 7.28 21.356 5.514 20.374c-.356-.198-.557-.593-.506-.998l.5-4c.042-.333 .247-.623 .548-.772 .301-.149 .656-.137 .946 .031C8.294 15.385 10.642 16 12 16c.39 0 .704-.147 .87-.295l.035-.035-.09-.035c-.167-.06-1.583-.493-2.153-.694C7.036 13.637 5 11.332 5 8 5 6.113 5.882 4.437 7.37 3.223 8.59 2.236 9.887 2 12.5 2"),
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
        return _brandStripe!!
    }

private var _brandStripe: ImageVector? = null
