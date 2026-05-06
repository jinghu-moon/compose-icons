package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Poo: ImageVector
    get() {
        if (_poo != null) return _poo!!
        _poo = tablerFilledIcon(
            name = "Poo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.063 2.995l.086 .009h.07c2.237 .098 3.87 1.686 4.214 4.046l.01 .075 .133 .04c.684 .221 1.284 .647 1.718 1.22l.125 .179c.438 .662 .638 1.453 .567 2.243l-.006 .049 .032 .025c.856 .691 1.39 1.703 1.476 2.8l.01 .191 .15 .125c1.044 .922 1.532 2.321 1.29 3.693l-.042 .208c-.4 1.728-1.89 2.986-3.72 3.092h-10.176C5.334 20.991 3.842 19.958 3.255 18.399 2.668 16.84 3.109 15.08 4.362 13.982l.14-.118 .011-.19c.087-1.096 .62-2.108 1.476-2.798l.032-.025-.006-.048c-.064-.716 .094-1.435 .452-2.058l.114-.186C7.184 7.647 8.179 7.069 9.336 6.995h.164c.743 0 1.26-1.242 .606-2.553l.006 .015-.01-.017c-.05-.102-.082-.211-.095-.323L10 4c0-.654 .539-1.031 1.063-1.005M14.821 15.429c-.151-.218-.383-.366-.644-.413-.261-.047-.53 .012-.748 .163-.859 .598-1.999 .598-2.858 0-.453-.315-1.077-.203-1.392 .25-.315 .453-.203 1.077 .25 1.392 1.545 1.076 3.597 1.076 5.142 0 .218-.151 .366-.383 .413-.644 .047-.261-.012-.53-.163-.748M10.01 11h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1M14.01 11h-.01c-.552 0-1 .448-1 1 0 .552 .448 1 1 1h.01c.552 0 1-.448 1-1 0-.552-.448-1-1-1"),
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
        return _poo!!
    }

private var _poo: ImageVector? = null
