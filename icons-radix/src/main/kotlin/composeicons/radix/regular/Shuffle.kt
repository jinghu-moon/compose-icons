package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Shuffle: ImageVector
    get() {
        if (_shuffle != null) return _shuffle!!
        _shuffle = radixIcon(
            name = "Shuffle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.09 8.128c.495 .665 .963 1.27 1.476 1.762 .724 .695 1.481 1.11 2.435 1.11h.793L11.646 9.854l-.064-.078c-.128-.194-.106-.458 .064-.629 .171-.171 .435-.193 .629-.064l.078 .064 2 2c.195 .195 .195 .512 0 .707l-2 2c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707l1.147-1.146h-.793c-1.296 0-2.289-.585-3.128-1.39C8.372 10.13 7.91 9.55 7.458 8.951 7.647 8.714 7.828 8.48 8 8.25c.031-.041 .06-.082 .09-.122ZM11.646 1.147c.171-.171 .435-.193 .629-.064l.078 .064 2 2 .064 .078c.128 .194 .106 .458-.064 .629l-2 2c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707L12.793 4h-.793c-.953 0-1.711 .416-2.435 1.11C8.823 5.824 8.171 6.773 7.4 7.8 5.892 9.812 4.01 12 .5 12 .224 12 0 11.776 0 11.5c0-.276 .224-.5 .5-.5 2.99 0 4.608-1.812 6.1-3.8C7.329 6.228 8.053 5.177 8.872 4.39 9.711 3.585 10.704 3 12 3h.793L11.646 1.854l-.064-.078c-.128-.194-.106-.458 .064-.629ZM.5 3c2.852 0 4.629 1.446 6.005 3.067C6.332 6.302 6.164 6.532 6 6.75c-.036 .048-.073 .096-.109 .144C4.572 5.294 3.026 4 .5 4 .224 4 0 3.776 0 3.5 0 3.224 .224 3 .5 3Z"),
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
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
