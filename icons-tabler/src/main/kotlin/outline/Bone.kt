package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = tablerOutlineIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 3.000 C 16.657 3.000 18.000 4.343 18.000 6.000 C 19.358 6.000 20.546 6.911 20.898 8.223 C 21.250 9.534 20.677 10.918 19.501 11.598 C 18.326 12.277 16.840 12.082 15.880 11.122 L 11.122 15.880 C 12.066 16.825 12.272 18.280 11.626 19.450 C 10.981 20.619 9.640 21.221 8.337 20.926 C 7.034 20.631 6.084 19.510 6.005 18.177 L 6.005 18.000 L 5.829 18.000 C 4.495 17.922 3.374 16.971 3.079 15.667 C 2.784 14.364 3.386 13.023 4.556 12.378 C 5.727 11.733 7.183 11.940 8.127 12.885 L 12.885 8.127 C 12.027 7.269 11.770 5.979 12.234 4.858 C 12.698 3.736 13.792 3.005 15.005 3.005 L 15.000 3.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _bone!!
    }

private var _bone: ImageVector? = null
