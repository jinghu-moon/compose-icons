package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareF5: ImageVector
    get() {
        if (_squareF5 != null) return _squareF5!!
        _squareF5 = tablerFilledIcon(
            name = "SquareF5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.333 2c1.96 0 3.56 1.537 3.662 3.472L22 5.667v12.666c0 1.96-1.537 3.56-3.472 3.662L18.333 22h-12.666C3.717 22 2.109 20.475 2.005 18.528L2 18.333v-12.666C2 3.707 3.537 2.107 5.472 2.005L5.667 2h12.666ZM16 8h-3l-.117 .007c-.418 .049-.761 .354-.857 .764l-.02 .112L12 9v3l.007 .117c.049 .418 .354 .761 .764 .857l.112 .02L13 13h2v1h-1.033l-.025-.087-.049-.113c-.208-.414-.674-.63-1.124-.523-.451 .107-.769 .51-.769 .973 0 .867 .63 1.587 1.458 1.726l.148 .018 .144 .006h1.25l.157-.006c.923-.073 1.675-.769 1.819-1.683l.019-.162L17 14v-1l-.006-.157c-.073-.923-.769-1.675-1.683-1.819l-.162-.019L15 11h-1v-1h2l.117-.007c.418-.049 .761-.354 .857-.764l.02-.112L17 9l-.007-.117c-.049-.418-.354-.761-.764-.857l-.112-.02L16 8ZM10 8h-2l-.117 .007c-.459 .054-.822 .417-.876 .876L7 9v6l.007 .117c.054 .459 .417 .822 .876 .876L8 16l.117-.007c.459-.054 .822-.417 .876-.876L9 15v-2h1l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L10 11h-1v-1h1l.117-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L10 8Z"),
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
        return _squareF5!!
    }

private var _squareF5: ImageVector? = null
