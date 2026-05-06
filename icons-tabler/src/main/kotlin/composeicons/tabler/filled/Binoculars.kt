package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = tablerFilledIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.887 6.748c-.163 0-.337 .016-.506 .057-.172 .041-.582 .165-.838 .562l-.014 .02L6.922 8.437c-.307 .205-.534 .46-.693 .717l-.014 .02L3.643 13.824c-.103 .158-.194 .323-.274 .494l-.006 .01C3.123 14.853 2.999 15.423 3 16c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-1h2v1c0 1.636 .997 3.107 2.516 3.714 1.519 .607 3.255 .227 4.383-.959 1.127-1.186 1.419-2.939 .736-4.425l-.004-.012c-.08-.171-.171-.336-.274-.494L17.785 9.174l-.014-.02c-.177-.286-.413-.53-.693-.716L16.471 7.387l-.014-.02c-.256-.397-.667-.52-.838-.562-.218-.05-.441-.067-.664-.051-.234 .013-.464 .066-.68 .156-.184 .081-.638 .327-.754 .889l-.007 .037-.14 1.1C13.154 9.219 13 9.576 13 10v1h-2v-1c0-.424-.154-.781-.373-1.064L10.487 7.836l-.008-.037c-.116-.562-.57-.808-.754-.889C9.509 6.82 9.279 6.767 9.045 6.754 8.992 6.75 8.94 6.748 8.887 6.748ZM7 14c.883 0 1.662 .58 1.915 1.427 .253 .846-.079 1.759-.817 2.244-.738 .485-1.707 .429-2.384-.138-.677-.568-.901-1.512-.552-2.324l.19-.342C5.712 14.344 6.316 14 7 14ZM17 14c.684 0 1.288 .344 1.648 .867l.19 .342c.349 .811 .125 1.756-.552 2.324-.677 .568-1.646 .624-2.384 .138-.738-.485-1.07-1.398-.817-2.244C15.338 14.58 16.117 14 17 14Z"),
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
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
