package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BuildingBroadcastTower: ImageVector
    get() {
        if (_buildingBroadcastTower != null) return _buildingBroadcastTower!!
        _buildingBroadcastTower = tablerFilledIcon(
            name = "BuildingBroadcastTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 10.000 C 12.787 10.000 13.501 10.461 13.825 11.179 C 14.148 11.897 14.019 12.738 13.497 13.327 L 15.949 20.684 C 16.124 21.208 15.840 21.774 15.316 21.949 C 14.792 22.124 14.226 21.840 14.051 21.316 L 13.611 20.000 L 10.387 20.000 L 9.949 21.317 C 9.789 21.798 9.294 22.083 8.797 21.980 L 8.684 21.950 C 8.432 21.866 8.224 21.686 8.105 21.449 C 7.987 21.211 7.967 20.937 8.051 20.685 L 10.503 13.328 C 10.179 12.962 10.000 12.489 10.000 12.000 L 10.005 11.850 C 10.083 10.806 10.953 10.000 12.000 10.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 18.093 4.078 C 21.686 6.839 22.973 11.671 21.230 15.854 C 21.017 16.364 20.432 16.605 19.922 16.392 C 19.412 16.179 19.171 15.594 19.384 15.084 C 20.778 11.738 19.748 7.872 16.874 5.663 C 14.000 3.455 9.999 3.455 7.125 5.663 C 4.251 7.872 3.221 11.738 4.615 15.084 C 4.828 15.594 4.587 16.179 4.077 16.392 C 3.567 16.605 2.982 16.364 2.769 15.854 C 1.026 11.671 2.313 6.839 5.906 4.078 C 9.499 1.317 14.500 1.317 18.093 4.078"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 15.657 7.243 C 17.813 8.900 18.585 11.799 17.539 14.309 C 17.326 14.819 16.741 15.060 16.231 14.847 C 15.721 14.634 15.480 14.049 15.693 13.539 C 16.391 11.866 15.876 9.933 14.438 8.828 C 13.001 7.724 11.001 7.724 9.564 8.828 C 8.126 9.933 7.611 11.866 8.309 13.539 C 8.522 14.049 8.281 14.634 7.771 14.847 C 7.261 15.060 6.676 14.819 6.463 14.309 C 5.417 11.799 6.189 8.900 8.345 7.243 C 10.501 5.587 13.501 5.586 15.657 7.243"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _buildingBroadcastTower!!
    }

private var _buildingBroadcastTower: ImageVector? = null
