package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Football: ImageVector
    get() {
        if (_football != null) return _football!!
        _football = phosphorThinIcon(
            name = "Football",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M225.12 54.56C223.059 42.437 213.563 32.941 201.44 30.88 169.83 25.52 110.28 23.05 66.66 66.66 23.04 110.27 25.52 169.83 30.88 201.44c2.061 12.123 11.557 21.619 23.68 23.68 11.131 1.894 22.4 2.857 33.69 2.88 31.3 0 70.19-7.77 101.09-38.66C233 145.72 230.48 86.17 225.12 54.56ZM167.42 35.9c10.957 .039 21.892 .996 32.69 2.86 8.76 1.509 15.621 8.37 17.13 17.13 2.693 15.213 3.472 30.703 2.32 46.11L154 36.43c4.33-.34 8.79-.53 13.42-.53ZM55.89 217.24C47.13 215.731 40.269 208.87 38.76 200.11 36.067 184.897 35.288 169.407 36.44 154L102 219.56c-15.407 1.152-30.897 .373-46.11-2.32ZM183.68 183.68c-12.22 12.23-35.23 29.34-71.56 34.73L37.59 143.88C43 107.55 60.09 84.54 72.32 72.32 84.55 60.1 107.56 43 143.89 37.6l74.52 74.52c-5.41 36.33-22.5 59.34-34.73 71.56ZM162.81 93.19c1.558 1.561 1.558 4.089 0 5.65L145.65 116l9.17 9.16c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L140 121.66 121.66 140l9.17 9.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L116 145.65 98.84 162.81c-.991 1.094-2.504 1.553-3.936 1.194-1.432-.359-2.55-1.477-2.908-2.908-.359-1.432 .101-2.945 1.194-3.936L110.35 140l-9.17-9.16c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0l9.17 9.17L134.34 116l-9.17-9.17c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0l9.16 9.17L157.16 93.18c1.564-1.555 4.091-1.55 5.65 .01Z"),
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
        return _football!!
    }

private var _football: ImageVector? = null
