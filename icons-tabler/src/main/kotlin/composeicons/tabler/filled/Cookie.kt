package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cookie: ImageVector
    get() {
        if (_cookie != null) return _cookie!!
        _cookie = tablerFilledIcon(
            name = "Cookie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.53 2.552l2.667 1.104c.287 .118 .503 .363 .584 .663 .081 .3 .018 .62-.17 .867-.814 1.072-.814 2.555-.001 3.627 .813 1.072 2.241 1.472 3.493 .977 .512-.203 1.091 .046 1.296 .557l.049 .122c.406 .98 .406 2.082 0 3.062l-.079 .151c-.467 .74-.785 1.314-.945 1.7-.166 .4-.373 1.097-.613 2.073l-.047 .144c-.406 .98-1.186 1.758-2.166 2.164l-.139 .046c-1.006 .253-1.705 .461-2.076 .615-.412 .17-.982 .486-1.696 .942l-.156 .082c-.98 .406-2.082 .406-3.062 0l-.148-.077c-.759-.475-1.333-.793-1.704-.947-.413-.171-1.109-.378-2.07-.612l-.146-.048C5.421 19.358 4.643 18.578 4.237 17.598l-.046-.138C3.937 16.451 3.728 15.751 3.576 15.382q-.256-.621-.942-1.695l-.082-.156c-.406-.98-.406-2.082 0-3.062l.084-.16c.447-.692 .761-1.262 .94-1.692 .147-.355 .356-1.057 .615-2.078l.045-.138C4.642 5.421 5.422 4.643 6.402 4.237l.141-.047c.988-.245 1.686-.453 2.074-.614 .395-.164 .967-.48 1.7-.944l.152-.08c.98-.406 2.082-.406 3.062 0M12 16c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1M16 13c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1M8 12c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01C9 12.448 8.552 12 8 12M12 11c-.552 0-1 .448-1 1v.01c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.01c0-.552-.448-1-1-1M11 7c-.552 0-1 .448-1 1.01 .003 .552 .453 .998 1.005 .995C11.557 9.002 12.003 8.552 12 8 12 7.448 11.552 7 11 7"),
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
        return _cookie!!
    }

private var _cookie: ImageVector? = null
