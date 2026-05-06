package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WechatChannelsFill: ImageVector
    get() {
        if (_wechatChannelsFill != null) return _wechatChannelsFill!!
        _wechatChannelsFill = remixIcon(
            name = "WechatChannelsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.194 3.181c1.162-.47 2.155-.019 2.673 1.277 1.393 3.486-1.868 16.676-4.426 16.676-.828 0-1.657-.689-2.623-1.927-.436-.558-.89-1.223-1.358-1.974-.374-.601-.741-1.232-1.095-1.871l-.365-.673-.018 .032c-.457 .855-.944 1.711-1.443 2.511-.467 .751-.922 1.416-1.358 1.974-.966 1.238-1.796 1.927-2.623 1.927C4.001 21.133 .74 7.944 2.133 4.458 2.651 3.162 3.644 2.711 4.806 3.181c.842 .341 1.772 1.155 2.811 2.376 .618 .726 1.265 1.586 1.931 2.553 .737 1.071 1.459 2.215 2.137 3.36l.316 .539 .315-.539c.542-.915 1.113-1.831 1.697-2.709l.44-.651c.666-.967 1.312-1.827 1.931-2.553C17.422 4.337 18.351 3.522 19.194 3.181ZM4.324 4.353C3.834 4.154 3.581 4.269 3.319 4.924c-.457 1.144-.265 4.028 .413 7.263l.159 .724 .174 .732c.856 3.461 2.086 6.224 2.494 6.224 .279 0 .889-.506 1.615-1.436 .405-.519 .835-1.148 1.281-1.864 .362-.581 .719-1.194 1.062-1.815l.415-.767 .348-.671-.364-.638-.332-.567C9.92 10.989 9.213 9.868 8.494 8.824 7.851 7.89 7.229 7.063 6.642 6.373 5.726 5.297 4.926 4.596 4.324 4.353ZM20.68 4.924c-.262-.655-.514-.77-1.005-.571-.602 .243-1.402 .945-2.318 2.021-.587 .69-1.209 1.517-1.852 2.45-.575 .836-1.143 1.72-1.687 2.615l-.574 .961-.527 .915 .181 .35 .245 .465c.445 .832 .918 1.664 1.401 2.439 .446 .715 .876 1.345 1.281 1.864 .726 .93 1.335 1.436 1.615 1.436 .408 0 1.639-2.764 2.494-6.224l.174-.732c.804-3.523 1.062-6.759 .571-7.988Z"),
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
        return _wechatChannelsFill!!
    }

private var _wechatChannelsFill: ImageVector? = null
