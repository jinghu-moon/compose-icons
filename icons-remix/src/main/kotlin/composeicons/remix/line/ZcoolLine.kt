package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ZcoolLine: ImageVector
    get() {
        if (_zcoolLine != null) return _zcoolLine!!
        _zcoolLine = remixIcon(
            name = "ZcoolLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.262 8.26C5.838 8.803 4.001 11.208 4.001 13.936c0 3.26 2.643 5.903 5.902 5.903 2.851 0 5.282-2.038 5.801-4.806 .12-.637 .54-1.176 1.128-1.448 .483-.223 .911-.473 1.285-.744-.864-.603-1.187-1.861-.471-2.834 .581-.789 1.051-1.659 1.392-2.651-1.084 .51-2.301 .937-3.668 1.265C14.108 8.925 12.978 7.984 12.904 6.808 11.724 7.38 10.234 7.819 8.262 8.26ZM19.257 11.193c1.166 0 1.916-.424 2.744-.586-.325 1.448-1.501 3.49-4.331 4.795-.687 3.664-3.903 6.437-7.767 6.437-4.364 0-7.902-3.538-7.902-7.903 0-3.645 2.467-6.876 5.824-7.627C11.746 5.431 13.529 4.742 14.902 2c.689 1.333 .689 2.892 .001 4.677 2.815-.67 5.073-1.853 6.773-3.548 0 4.802-1.823 7.186-2.419 8.064ZM13.418 15.126c.583 .146 .583 .833 .583 1.021v1.021c0 .562-.342 .773-.844 .773h-5.415c-.475-.086-.734-.346-.734-.777v-.95c0-.475 .216-.821 .432-1.08l3.153-3.369h-3.066c-.302 0-.518-.216-.518-.605C6.965 10.425 7.095 9.259 7.656 9c.086 0 .086 .13 .086 .173-.086 .173 0 .302 .216 .302h3.887c.864 0 1.382 0 1.684-.086 .129-.043 .216 0 .173 .13-.086 .302-.043 .648-.043 .95 0 .993 0 1.382-.777 2.16l-2.678 2.937 2.849-.002c.317 0 .365-.146 .365-.438Z"),
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
        return _zcoolLine!!
    }

private var _zcoolLine: ImageVector? = null
