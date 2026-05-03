package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BoneOff: ImageVector
    get() {
        if (_boneOff != null) return _boneOff!!
        _boneOff = tablerOutlineIcon(
            name = "BoneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.500 8.502 L 12.880 8.122 C 11.919 7.162 11.723 5.677 12.401 4.500 C 13.080 3.324 14.464 2.750 15.776 3.102 C 17.088 3.453 18.000 4.642 18.000 6.000 C 19.358 6.000 20.546 6.911 20.898 8.223 C 21.250 9.534 20.677 10.918 19.501 11.598 C 18.326 12.277 16.840 12.082 15.880 11.122 L 15.508 11.494M 13.500 13.502 L 11.122 15.880 C 12.066 16.825 12.272 18.280 11.626 19.450 C 10.981 20.619 9.640 21.221 8.337 20.926 C 7.034 20.631 6.084 19.510 6.005 18.177 L 6.005 18.000 L 5.829 18.000 C 4.495 17.922 3.374 16.971 3.079 15.667 C 2.784 14.364 3.386 13.023 4.556 12.378 C 5.727 11.733 7.183 11.940 8.127 12.885 L 10.505 10.507"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _boneOff!!
    }

private var _boneOff: ImageVector? = null
