package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DirectionSign: ImageVector
    get() {
        if (_directionSign != null) return _directionSign!!
        _directionSign = tablerFilledIcon(
            name = "DirectionSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.52 2.614c.771-.77 2.003-.821 2.835-.117l.126 .117 7.905 7.905c.777 .777 .816 2.013 .117 2.836l-.117 .126-7.905 7.905c-.771 .771-2.004 .822-2.836 .117l-.126-.117L2.612 13.48c-.769-.771-.819-2.004-.115-2.835l.117-.126L10.519 2.614ZM16.489 12.149l.01-.116-.003-.12-.016-.114-.03-.11-.044-.112-.052-.098-.076-.105-.07-.081L12.708 7.793l-.095-.083c-.361-.28-.865-.28-1.226 0l-.094 .083-.083 .094c-.28 .361-.28 .865 0 1.226l.083 .094L13.085 11h-5.085l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L8 13h5.085l-1.792 1.793-.083 .094c-.309 .398-.273 .964 .083 1.32 .356 .356 .922 .392 1.32 .083l.094-.083 3.5-3.5 .097-.112 .05-.074 .037-.067 .05-.112 .023-.076 .025-.117Z"),
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
        return _directionSign!!
    }

private var _directionSign: ImageVector? = null
