package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) return _googleDriveLogo!!
        _googleDriveLogo = phosphorLightIcon(
            name = "GoogleDriveLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.9 144.82 167.43 32.58C164.884 28.474 160.391 25.983 155.56 26h-55.13c-4.83-.015-9.323 2.476-11.87 6.58v.05L20.13 144.76c-2.733 4.373-2.84 9.894-.28 14.37L47.17 207c2.505 4.34 7.139 7.009 12.15 7h137.35c5.014 .013 9.653-2.657 12.16-7l27.32-47.82c2.565-4.468 2.469-9.984-.25-14.36ZM222.56 146h-51.17L135 85.33 160.08 43.54ZM98.56 146 128 97l29.4 49ZM164.56 158 191 202h-126L91.4 158ZM128 73.67 106.6 38h42.8ZM95.93 43.54 121 85.33 84.6 146h-51.17ZM33 158h44.4L54.67 195.89ZM201.3 195.89 178.59 158h44.41Z"),
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
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
