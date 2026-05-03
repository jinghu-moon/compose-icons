package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Blob: ImageVector
    get() {
        if (_blob != null) return _blob!!
        _blob = tablerOutlineIcon(
            name = "Blob",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.897 20.188 C 7.567 20.940 9.793 21.000 12.000 21.000 C 14.207 21.000 16.434 20.941 18.104 20.188 C 18.972 19.796 19.718 19.206 20.237 18.332 C 20.751 17.467 21.000 16.392 21.000 15.098 C 21.000 12.521 20.017 9.783 18.443 7.682 C 16.873 5.588 14.610 4.000 12.000 4.000 C 9.390 4.000 7.127 5.588 5.557 7.682 C 3.983 9.783 3.000 12.522 3.000 15.098 C 3.000 16.393 3.249 17.467 3.763 18.332 C 4.282 19.206 5.028 19.796 5.897 20.188"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _blob!!
    }

private var _blob: ImageVector? = null
