package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Pencil1: ImageVector
    get() {
        if (_pencil1 != null) return _pencil1!!
        _pencil1 = radixIcon(
            name = "Pencil1",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.225 1.082c.194-.128 .458-.106 .629 .064l2 2 .064 .078c.128 .194 .106 .458-.064 .629L6.422 11.285c-.067 .067-.144 .125-.228 .171l-.086 .041L2.697 12.96c-.188 .08-.406 .038-.551-.106-.145-.145-.187-.363-.106-.551L3.503 8.892l.041-.086c.046-.083 .103-.16 .171-.228L11.146 1.146l.078-.064ZM4.422 9.285l-.642 1.495 .438 .438 1.497-.64L12.793 3.5 11.5 2.207 4.422 9.285Z"),
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
        return _pencil1!!
    }

private var _pencil1: ImageVector? = null
