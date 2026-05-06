package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VisaLine: ImageVector
    get() {
        if (_visaLine != null) return _visaLine!!
        _visaLine = remixIcon(
            name = "VisaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.222 15.768l-.224-1.125h-2.514l-.399 1.117-2.016 .004c1.296-3.113 2.257-5.419 2.884-6.918 .164-.391 .455-.591 .884-.588 .327 .002 .863 .003 1.606 .001L24 15.765l-1.778 .003ZM20.049 13.102h1.621l-.605-2.82-1.016 2.82ZM7.061 8.257l2.026 .003L5.955 15.768 3.904 15.767C3.21 13.09 2.701 11.104 2.376 9.811 2.276 9.415 2.078 9.138 1.697 9.007 1.357 8.89 .792 8.71 0 8.466v-.206c1.48-0 2.559-0 3.237 0 .56 0 .887 .271 .992 .826 .106 .558 .372 1.976 .8 4.254L7.061 8.257ZM11.87 8.259l-1.601 7.508L8.341 15.765c.038-.182 .571-2.685 1.599-7.508l1.93 .003ZM15.781 8.12c.576 0 1.303 .179 1.722 .345l-.338 1.557c-.378-.152-.999-.357-1.523-.349-.761 .012-1.231 .331-1.231 .638 0 .497 .816 .748 1.656 1.292 .958 .621 1.085 1.177 1.073 1.783-.013 1.256-1.073 2.495-3.309 2.495-1.021-.015-1.388-.101-2.22-.396l.352-1.624c.847 .355 1.206 .467 1.93 .467 .663 0 1.233-.268 1.238-.735 .003-.332-.2-.496-.944-.907-.744-.411-1.788-.979-1.774-2.122 .017-1.462 1.402-2.443 3.369-2.443Z"),
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
        return _visaLine!!
    }

private var _visaLine: ImageVector? = null
