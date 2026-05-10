package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SketchLogo: ImageVector
    get() {
        if (_sketchLogo != null) return _sketchLogo!!
        _sketchLogo = phosphorFillIcon(
            name = "SketchLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 98.73 190 34.73C188.485 33 186.299 32.005 184 32h-112c-2.299 .005-4.485 1-6 2.73L10 98.73c-2.706 3.09-2.633 7.727 .17 10.73L122.17 229.46c1.513 1.622 3.632 2.543 5.85 2.543 2.218 0 4.337-.921 5.85-2.543l112-120c2.791-3.013 2.848-7.65 .13-10.73ZM222.37 96h-42.37L144 48h36.37ZM74.58 112l30.13 75.33L34.41 112ZM181.42 112h40.17l-70.3 75.33ZM75.63 48h36.37L76 96h-42.37Z"),
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
        return _sketchLogo!!
    }

private var _sketchLogo: ImageVector? = null
