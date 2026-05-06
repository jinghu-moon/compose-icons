package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FinnTheHuman: ImageVector
    get() {
        if (_finnTheHuman != null) return _finnTheHuman!!
        _finnTheHuman = phosphorBoldIcon(
            name = "FinnTheHuman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 96h-64C67.281 96 44 119.281 44 148c0 28.719 23.281 52 52 52h64c28.719 0 52-23.281 52-52C212 119.281 188.719 96 160 96ZM160 176h-64C80.536 176 68 163.464 68 148c0-15.464 12.536-28 28-28h64c15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM112 148c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM176 148c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM212 36c-15.256 0-28.855 9.617-33.94 24h-100.12C72.094 43.471 55.192 33.557 37.912 36.522 20.633 39.486 8.002 54.468 8 72v76c.055 48.578 39.422 87.945 88 88h64c48.578-.055 87.945-39.422 88-88v-76C248 52.118 231.882 36 212 36ZM224 148c-.039 35.33-28.67 63.961-64 64h-64C60.67 211.961 32.039 183.33 32 148v-76C32 65.373 37.373 60 44 60c6.627 0 12 5.373 12 12 0 6.627 5.373 12 12 12h120c6.627 0 12-5.373 12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _finnTheHuman!!
    }

private var _finnTheHuman: ImageVector? = null
