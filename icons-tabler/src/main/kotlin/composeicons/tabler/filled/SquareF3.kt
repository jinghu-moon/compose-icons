package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF3: ImageVector
    get() {
        if (_squareF3 != null) return _squareF3!!
        _squareF3 = tablerFilledIcon(
            name = "SquareF3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM14.5 8h-1l-.144 .007C12.587 8.081 12 8.727 12 9.5c0 .552 .448 1 1 1l.117-.007c.299-.035 .566-.203 .727-.457L13.864 10h.636l.09 .008c.238 .043 .411 .25 .411 .492 0 .242-.173 .449-.411 .492L14.5 11h-.5l-.133 .007c-1.156 .124-1.156 1.862 0 1.986L14 13h.5l.09 .008c.238 .043 .41 .251 .41 .492l-.008 .09c-.043 .238-.251 .41-.492 .41h-.635l-.02-.036c-.238-.376-.696-.55-1.124-.426-.428 .124-.722 .516-.721 .962 0 .828 .672 1.5 1.5 1.5h1l.164-.005c1.314-.086 2.336-1.178 2.336-2.495l-.005-.164c-.03-.474-.196-.929-.477-1.312L16.499 12l.126-.183c.478-.771 .501-1.74 .059-2.533C16.243 8.491 15.407 8 14.5 8ZM10 8h-2l-.117 .007C7.38 8.066 7 8.493 7 9v6l.007 .117c.059 .503 .486 .883 .993 .883l.117-.007C8.62 15.934 9 15.507 9 15v-2h1l.117-.007c.525-.062 .911-.523 .88-1.052C10.966 11.413 10.529 11.001 10 11h-1v-1h1l.117-.007c.525-.062 .911-.523 .88-1.052C10.966 8.413 10.529 8.001 10 8Z"),
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
        return _squareF3!!
    }

private var _squareF3: ImageVector? = null
