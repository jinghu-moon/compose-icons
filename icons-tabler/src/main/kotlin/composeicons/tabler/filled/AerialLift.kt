package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AerialLift: ImageVector
    get() {
        if (_aerialLift != null) return _aerialLift!!
        _aerialLift = tablerFilledIcon(
            name = "AerialLift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.876 2.008c.359-.054 .719 .092 .94 .379 .221 .288 .269 .673 .126 1.006-.144 .333-.457 .562-.818 .599L13 4.883v2.117h4.2c.256-0 .502 .098 .688 .274l.087 .093c2.79 3.417 2.717 9.963-.226 13.295-.19 .215-.462 .338-.749 .338h-10.106c-.294 0-.573-.129-.763-.353C3.271 17.274 3.271 10.727 6.131 7.353 6.321 7.129 6.6 7 6.894 7h4.106v-1.867L4.124 5.993C3.621 6.056 3.15 5.732 3.029 5.239L3.008 5.124C2.94 4.576 3.328 4.077 3.876 4.008l7.996-1 .011-.001 .008-.001ZM11 9h-3.617l-.051 .072c-.718 1.042-1.149 2.41-1.292 3.844L6.032 13h4.968ZM16.698 9h-3.698v4h4.979l-.005-.072c-.123-1.436-.533-2.811-1.232-3.864Z"),
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
        return _aerialLift!!
    }

private var _aerialLift: ImageVector? = null
