package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ColorFilterAiFill: ImageVector
    get() {
        if (_colorFilterAiFill != null) return _colorFilterAiFill!!
        _colorFilterAiFill = remixIcon(
            name = "ColorFilterAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.511 7.3c.385 .168 .77 .334 1.152 .506-.029 .075-.059 .148-.092 .221-1.996 .18-3.886 1.213-5.101 2.945C8.958 10.708 7 8.583 7 6c0-2.761 2.239-5 5-5 1.46 0 2.773 .625 3.687 1.623C14.705 3.051 14 3.896 14 5c0 .994 .601 1.904 1.511 2.3ZM13.154 17.946c.842-1.819 .893-3.972 .001-5.891 1.485-2.044 4.304-2.677 6.541-1.385 2.391 1.381 3.211 4.438 1.83 6.83-1.381 2.392-4.439 3.211-6.83 1.83-.625-.361-1.142-.836-1.541-1.384ZM6.273 10.027c1.154 1.638 2.994 2.759 5.101 2.946 1.027 2.308 .165 5.066-2.071 6.357C6.912 20.711 3.854 19.891 2.473 17.5 1.093 15.108 1.912 12.05 4.304 10.67c.625-.361 1.295-.571 1.97-.643ZM16.876 5.713l-.566-.247c-.414-.18-.414-.753 0-.934l.566-.247c1.009-.44 1.812-1.231 2.251-2.219l.338-.76c.183-.411 .78-.411 .963 0l.319 .717c.451 1.013 1.284 1.819 2.326 2.251l.596 .253c.426 .176 .426 .765 0 .941l-.596 .253c-1.043 .432-1.876 1.238-2.326 2.251l-.319 .717c-.183 .411-.78 .411-.963 0l-.338-.76C18.688 6.945 17.885 6.153 16.876 5.713Z"),
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
        return _colorFilterAiFill!!
    }

private var _colorFilterAiFill: ImageVector? = null
