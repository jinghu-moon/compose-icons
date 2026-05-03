package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDrupal: ImageVector
    get() {
        if (_brandDrupal != null) return _brandDrupal!!
        _brandDrupal = tablerOutlineIcon(
            name = "BrandDrupal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 12.000 6.308 5.000 8.000 5.000 14.000 C 5.000 17.866 8.134 21.000 12.000 21.000 C 15.866 21.000 19.000 17.866 19.000 14.000 C 19.000 8.000 12.000 6.303 12.000 2.000"),
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
                pathData = parseSvgPathData("M 12.000 11.330 C 11.344 12.019 10.673 12.693 9.988 13.353 C 8.988 14.310 8.000 15.320 8.000 17.000 C 8.000 19.170 9.790 21.000 12.000 21.000 C 14.210 21.000 16.000 19.173 16.000 17.000 C 16.000 15.324 15.011 14.315 14.017 13.358 C 13.597 12.954 11.758 11.001 8.500 7.500 L 12.000 11.330"),
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
        return _brandDrupal!!
    }

private var _brandDrupal: ImageVector? = null
