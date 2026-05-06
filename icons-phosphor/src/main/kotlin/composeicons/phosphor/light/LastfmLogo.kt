package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorLightIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 160c0 20.987-17.013 38-38 38h-17.43c-20.966-.049-40.025-12.183-48.94-31.16L111.49 102.24C104.563 87.476 89.738 78.035 73.43 78h-9.43C40.804 78 22 96.804 22 120v24c0 23.196 18.804 42 42 42h8c13.522 .003 25.761-8.007 31.17-20.4 1.325-3.038 4.862-4.425 7.9-3.1 3.038 1.325 4.425 4.862 3.1 7.9C106.852 187.167 90.294 198.004 72 198h-8C34.19 197.967 10.033 173.81 10 144v-24C10.033 90.19 34.19 66.033 64 66h9.43c20.966 .049 40.025 12.183 48.94 31.16l30.14 64.6c6.927 14.764 21.752 24.205 38.06 24.24h17.43c14.359 0 26-11.641 26-26 0-14.359-11.641-26-26-26h-20c-18.778 0-34-15.222-34-34 0-18.778 15.222-34 34-34h20c16.569 0 30 13.431 30 30 0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6 0-9.941-8.059-18-18-18h-20c-12.15 0-22 9.85-22 22 0 12.15 9.85 22 22 22h20c20.987 0 38 17.013 38 38Z"),
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
        return _lastfmLogo!!
    }

private var _lastfmLogo: ImageVector? = null
