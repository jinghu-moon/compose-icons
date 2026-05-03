package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSvelte: ImageVector
    get() {
        if (_brandSvelte != null) return _brandSvelte!!
        _brandSvelte = tablerOutlineIcon(
            name = "BrandSvelte",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 8.000 L 10.000 11.000 L 10.821 10.505 C 12.681 9.355 15.233 10.015 16.395 11.857 C 16.953 12.742 17.133 13.813 16.896 14.831 C 16.658 15.850 16.023 16.731 15.131 17.277 L 10.078 20.403 C 8.218 21.554 5.766 20.994 4.604 19.152 C 4.046 18.268 3.865 17.197 4.103 16.178 C 4.340 15.160 4.975 14.279 5.867 13.732 L 6.127 13.572"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 8.000 17.000 L 13.000 14.000 L 12.178 14.496 C 10.318 15.647 7.767 14.987 6.604 13.145 C 6.046 12.260 5.866 11.189 6.103 10.171 C 6.341 9.152 6.976 8.271 7.868 7.725 L 12.922 4.598 C 14.782 3.448 17.233 4.008 18.396 5.850 C 18.954 6.735 19.134 7.806 18.897 8.824 C 18.659 9.843 18.024 10.724 17.132 11.270 L 16.872 11.430"),
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
        return _brandSvelte!!
    }

private var _brandSvelte: ImageVector? = null
