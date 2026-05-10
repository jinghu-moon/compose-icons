package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WhatsappFill: ImageVector
    get() {
        if (_whatsappFill != null) return _whatsappFill!!
        _whatsappFill = remixIcon(
            name = "WhatsappFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.001 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C10.167 22 8.449 21.506 6.971 20.645L2.005 22 3.357 17.031C2.495 15.554 2.001 13.835 2.001 12 2.001 6.477 6.478 2 12.001 2ZM8.593 7.3l-.201 .008c-.129 .009-.256 .041-.372 .1-.087 .044-.167 .108-.293 .228-.119 .113-.189 .211-.261 .306-.37 .481-.568 1.072-.565 1.679 .002 .491 .129 .967 .331 1.413 .408 .903 1.081 1.857 1.97 2.742 .214 .213 .423 .427 .648 .626 1.103 .972 2.418 1.672 3.84 2.046 0 0 .56 .086 .568 .087 .186 .01 .371-.003 .556-.013 .291-.015 .576-.094 .833-.231 .165-.088 .244-.132 .383-.219 0 0 .043-.029 .125-.09 .135-.101 .218-.171 .331-.288 .083-.086 .154-.188 .209-.302 .078-.163 .157-.475 .188-.733 .024-.198 .017-.306 .014-.372-.004-.108-.093-.218-.191-.265l-.582-.261c0 0-.869-.378-1.401-.621-.055-.025-.116-.037-.177-.041-.133-.008-.283 .027-.378 .127-.005-.002-.071 .055-.795 .932-.04 .048-.133 .151-.295 .142-.024-.002-.049-.005-.072-.011-.065-.017-.129-.04-.192-.066-.124-.053-.167-.072-.252-.109-.577-.252-1.107-.59-1.575-1.003-.126-.111-.242-.23-.363-.346-.42-.407-.764-.84-1.02-1.268-.014-.023-.036-.057-.059-.095-.042-.068-.088-.149-.103-.205-.037-.147 .061-.265 .061-.265 0 0 .243-.266 .356-.411 .109-.139 .203-.276 .263-.373 .118-.189 .155-.385 .093-.536C9.938 8.926 9.648 8.245 9.35 7.569 9.291 7.435 9.116 7.338 8.957 7.32 8.903 7.314 8.849 7.308 8.795 7.304c-.134-.007-.268-.005-.402 .004l.201-.008Z"),
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
        return _whatsappFill!!
    }

private var _whatsappFill: ImageVector? = null
