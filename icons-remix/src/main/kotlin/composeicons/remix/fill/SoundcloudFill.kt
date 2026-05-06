package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SoundcloudFill: ImageVector
    get() {
        if (_soundcloudFill != null) return _soundcloudFill!!
        _soundcloudFill = remixIcon(
            name = "SoundcloudFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.464 8.596c.265 0 .48 2.106 .48 4.704l-.001 .351c-.018 2.434-.226 4.353-.479 4.353-.256 0-.465-1.965-.479-4.44l-.001-.352c.005-2.557 .218-4.616 .48-4.616ZM8.8 9.556c.259 0 .469 1.8 .48 4.054v.34c-.01 2.254-.221 4.054-.48 4.054-.255 0-.464-1.755-.479-3.97l-.001-.339 .002-.34c.024-2.133 .229-3.798 .478-3.798ZM7.136 9.556c.255 0 .464 1.755 .479 3.97l.001 .339-.002 .34c-.024 2.133-.229 3.798-.478 3.798-.259 0-.469-1.8-.48-4.054v-.34c.01-2.254 .221-4.054 .48-4.054ZM5.472 10.132c.265 0 .48 1.762 .48 3.936l-.002 .335c-.021 2.017-.227 3.601-.478 3.601-.262 0-.474-1.717-.48-3.852v-.169c.005-2.135 .218-3.851 .48-3.851ZM3.808 11.86c.265 0 .48 1.375 .48 3.072l-.001 .158c-.013 1.623-.223 2.914-.479 2.914-.265 0-.48-1.375-.48-3.072l.001-.158c.013-1.623 .223-2.914 .479-2.914ZM14.592 7.06c2.581 0 4.721 1.886 5.118 4.354 .295-.085 .607-.13 .93-.13 1.856 0 3.36 1.504 3.36 3.36 0 1.834-1.47 3.326-3.297 3.359l-.063 .001h-8.16c-.424 0-.768-.344-.768-.768v-9.303c.824-.551 1.814-.873 2.88-.873ZM2.144 11.668c.265 0 .48 1.332 .48 2.976l-.001 .155c-.013 1.571-.223 2.821-.479 2.821-.261 0-.473-1.291-.48-2.898l-0-.078c0-1.644 .215-2.976 .48-2.976ZM.48 12.628c.265 0 .48 .945 .48 2.112l-.001 .131C.944 15.976 .735 16.852 .48 16.852 .215 16.852 0 15.906 0 14.74l.001-.131C.016 13.504 .225 12.628 .48 12.628Z"),
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
        return _soundcloudFill!!
    }

private var _soundcloudFill: ImageVector? = null
