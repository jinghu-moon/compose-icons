package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ListSettingsFill: ImageVector
    get() {
        if (_listSettingsFill != null) return _listSettingsFill!!
        _listSettingsFill = remixIcon(
            name = "ListSettingsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 18h7v2h-7v-2ZM2 11h9v2h-9v-2ZM2 4h20v2h-20v-2ZM20.674 13.025l1.156-.391 1 1.732-.916 .805c.056 .267 .086 .545 .086 .829 0 .284-.03 .561-.086 .829l.916 .805-1 1.732-1.156-.391c-.41 .369-.898 .655-1.435 .83L19 21h-2l-.239-1.196c-.537-.175-1.024-.46-1.435-.83l-1.156 .391-1-1.732 .916-.805C14.03 16.561 14 16.284 14 16c0-.284 .03-.561 .086-.829l-.916-.805 1-1.732 1.156 .391c.41-.369 .898-.655 1.435-.83L17 11h2l.239 1.196c.537 .175 1.024 .46 1.435 .83ZM18 17c.552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1Z"),
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
        return _listSettingsFill!!
    }

private var _listSettingsFill: ImageVector? = null
