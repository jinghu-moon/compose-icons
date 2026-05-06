package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BeerBottle: ImageVector
    get() {
        if (_beerBottle != null) return _beerBottle!!
        _beerBottle = phosphorBoldIcon(
            name = "BeerBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248.49 39.51l-32-32C212.145 3.201 205.254 2.852 200.495 6.7c-4.758 3.848-5.859 10.659-2.555 15.81L147 60.77l-37.33 7.46c-2.324 .468-4.459 1.608-6.14 3.28L20.2 154.83c-5.252 5.251-8.202 12.373-8.202 19.8 0 7.427 2.95 14.549 8.202 19.8l41.37 41.37c5.251 5.252 12.373 8.202 19.8 8.202 7.427 0 14.549-2.95 19.8-8.202l83.32-83.31c1.672-1.681 2.812-3.816 3.28-6.14L195.23 109 233.46 58c5.151 3.304 11.962 2.203 15.81-2.555 3.848-4.758 3.499-11.649-.81-15.995ZM112 191 65 144 96 113l47 47ZM81.37 220c-1.061 .001-2.079-.42-2.83-1.17L37.17 177.46c-.751-.75-1.173-1.768-1.173-2.83 0-1.062 .422-2.08 1.173-2.83L48 161l47 47L84.2 218.83c-.751 .75-1.769 1.171-2.83 1.17ZM174.37 96.8c-1.077 1.434-1.818 3.091-2.17 4.85L165 138.08 160 143 113 96l5-5 36.43-7.28c1.759-.352 3.416-1.093 4.85-2.17L214.95 39.79l1.29 1.29Z"),
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
        return _beerBottle!!
    }

private var _beerBottle: ImageVector? = null
