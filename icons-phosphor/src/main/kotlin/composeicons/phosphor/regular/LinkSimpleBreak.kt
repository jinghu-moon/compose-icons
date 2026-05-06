package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) return _linkSimpleBreak!!
        _linkSimpleBreak = phosphorRegularIcon(
            name = "LinkSimpleBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 80c.038 14.86-5.867 29.118-16.4 39.6l-30.07 30.06c-3.126 3.123-8.192 3.121-11.315-.005-3.123-3.126-3.121-8.192 .005-11.315l30.07-30.06C214.583 98.213 218.672 83.392 214.996 69.471 211.32 55.551 200.447 44.68 186.527 41.007c-13.921-3.673-28.742 .418-38.807 10.713L117.66 81.77c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L136.4 40.4C152.416 24.382 176.504 19.59 197.431 28.259 218.358 36.927 232.002 57.349 232 80ZM138.34 174.22l-30.06 30.06C98.213 214.573 83.392 218.662 69.471 214.986 55.551 211.31 44.68 200.437 41.007 186.517c-3.673-13.921 .418-28.742 10.713-38.807L81.77 117.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L40.4 136.4c-21.87 21.87-21.87 57.33 0 79.2 21.87 21.87 57.33 21.87 79.2 0l30.06-30.07c3.123-3.126 3.121-8.192-.005-11.315-3.126-3.123-8.192-3.121-11.315 .005Z"),
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
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
