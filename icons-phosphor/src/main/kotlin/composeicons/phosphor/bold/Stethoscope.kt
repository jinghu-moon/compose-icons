package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorBoldIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 160c.005-20.437-15.396-37.591-35.715-39.78-20.319-2.19-39.021 11.29-43.369 31.258-4.349 19.969 7.055 40.004 26.444 46.462C192.565 210.814 181.174 219.999 168 220h-24c-15.464 0-28-12.536-28-28v-37.1c31.73-5.78 56-34.09 56-67.73v-47.17c0-6.627-5.373-12-12-12h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12v35.17c0 24.4-19.47 44.52-43.41 44.83-11.771 .158-23.115-4.408-31.495-12.677C64.716 111.054 59.999 99.772 60 88v-36h12c6.627 0 12-5.373 12-12C84 33.373 78.627 28 72 28h-24C41.373 28 36 33.373 36 40v48c.001 32.925 23.591 61.12 56 66.93v37.07c.033 28.705 23.295 51.967 52 52h24c26.276-.032 48.41-19.639 51.61-45.72C236.456 193.143 247.975 177.612 248 160ZM208 176c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
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
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
