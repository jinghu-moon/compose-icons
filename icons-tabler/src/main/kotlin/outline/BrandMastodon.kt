package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMastodon: ImageVector
    get() {
        if (_brandMastodon != null) return _brandMastodon!!
        _brandMastodon = tablerOutlineIcon(
            name = "BrandMastodon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.648 15.254 C 16.832 17.017 12.000 16.880 12.000 16.880 C 10.899 16.894 9.798 16.808 8.712 16.624 C 9.839 18.609 12.832 19.434 17.694 19.099 C 15.749 21.112 4.096 24.356 4.026 11.463 L 4.000 10.309 C 4.000 7.273 4.023 6.194 5.352 4.676 C 7.023 2.766 12.000 3.010 12.000 3.010 C 12.000 3.010 16.977 2.767 18.648 4.677 C 19.977 6.195 20.000 7.274 20.000 10.310 C 20.000 13.346 19.544 14.384 18.648 15.254"),
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
        pathData = parseSvgPathData("M 12.000 11.204 L 12.000 8.278 C 12.000 7.020 11.105 6.000 10.000 6.000 C 8.895 6.000 8.000 7.020 8.000 8.278 L 8.000 13.000M 12.000 8.278 C 12.000 7.020 12.895 6.000 14.000 6.000 C 15.105 6.000 16.000 7.020 16.000 8.278 L 16.000 13.000"),
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
        return _brandMastodon!!
    }

private var _brandMastodon: ImageVector? = null
