package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserFocus: ImageVector
    get() {
        if (_userFocus != null) return _userFocus!!
        _userFocus = phosphorBoldIcon(
            name = "UserFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 40v36c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-24h-24c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h36c6.627 0 12 5.373 12 12ZM216 168c-6.627 0-12 5.373-12 12v24h-24c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h36c6.627 0 12-5.373 12-12v-36c0-6.627-5.373-12-12-12ZM76 204h-24v-24c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v36c0 6.627 5.373 12 12 12h36c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM40 88c6.627 0 12-5.373 12-12v-24h24c6.627 0 12-5.373 12-12C88 33.373 82.627 28 76 28h-36C33.373 28 28 33.373 28 40v36c0 6.627 5.373 12 12 12ZM176 180c-3.775 .002-7.332-1.772-9.6-4.79-9.064-12.095-23.296-19.213-38.41-19.213-15.114 0-29.346 7.119-38.41 19.213-4.026 5.157-11.441 6.138-16.67 2.207-5.229-3.931-6.346-11.327-2.51-16.627 6.365-8.513 14.533-15.513 23.92-20.5C79.307 122.444 80.825 95.984 97.782 79.973c16.956-16.011 43.46-16.011 60.416 0 16.956 16.011 18.475 42.471 3.462 60.317 9.387 4.987 17.555 11.987 23.92 20.5 2.731 3.633 3.175 8.498 1.146 12.565-2.028 4.068-6.181 6.64-10.726 6.645ZM128 132c11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20Z"),
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
        return _userFocus!!
    }

private var _userFocus: ImageVector? = null
